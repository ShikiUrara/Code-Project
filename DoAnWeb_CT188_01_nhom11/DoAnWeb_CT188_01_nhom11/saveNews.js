 // ************************************************
 // SAVE News API
 // ************************************************
 $(document).ready(function() {

     var shoppingCart = (function() {
         // =============================
         // Private methods and propeties
         // =============================
         cart = [];

         // Constructor
         function Item(name, img, count) {
             this.name = name;
             this.img = img;
             this.count = count;
         }

         // Save cart
         function saveCart() {
             sessionStorage.setItem('shoppingCart', JSON.stringify(cart));
         }

         // Load cart
         function loadCart() {
             cart = JSON.parse(sessionStorage.getItem('shoppingCart'));
         }
         if (sessionStorage.getItem("shoppingCart") != null) {
             loadCart();
         }


         // =============================
         // Public methods and propeties
         // =============================
         var obj = {};

         // Add to cart
         obj.addItemToCart = function(name, img, count) {
                 for (var item in cart) {
                     if (cart[item].name === name) {
                         cart[item].count++;
                         saveCart();
                         return;
                     }
                 }
                 var item = new Item(name, img, count);
                 cart.push(item);
                 saveCart();
             }
             // Set count from item
         obj.setCountForItem = function(name, count) {
             for (var i in cart) {
                 if (cart[i].name === name) {
                     cart[i].count = count;
                     break;
                 }
             }
         };
         // Remove item from cart
         obj.removeItemFromCart = function(name) {
             for (var item in cart) {
                 if (cart[item].name === name) {
                     cart[item].count--;
                     if (cart[item].count === 0) {
                         cart.splice(item, 1);
                     }
                     break;
                 }
             }
             saveCart();
         }

         // Remove all items from cart
         obj.removeItemFromCartAll = function(img) {
             for (var item in cart) {
                 if (cart[item].img === img) {
                     cart.splice(item, 1);
                     break;
                 }
             }
             saveCart();
         }

         // Clear cart
         obj.clearCart = function() {
             cart = [];
             saveCart();
         }

         // Count cart 
         obj.totalCount = function() {
             var totalCount = 0;
             for (var item in cart) {
                 totalCount += cart[item].count;
             }
             return totalCount;
         }

         // Total cart
         obj.totalCart = function() {
             var totalCart = 0;
             for (var item in cart) {
                 totalCart += cart[item].img * cart[item].count;
             }
             return Number(totalCart.toFixed(2));
         }

         // List cart
         obj.listCart = function() {
             var cartCopy = [];
             for (i in cart) {
                 item = cart[i];
                 itemCopy = {};
                 for (p in item) {
                     itemCopy[p] = item[p];

                 }
                 itemCopy.total = Number(item.img * item.count).toFixed(2);
                 cartCopy.push(itemCopy)
             }
             return cartCopy;
         }

         // cart : Array
         // Item : Object/Class
         // addItemToCart : Function
         // removeItemFromCart : Function
         // removeItemFromCartAll : Function
         // clearCart : Function
         // countCart : Function
         // totalCart : Function
         // listCart : Function
         // saveCart : Function
         // loadCart : Function
         return obj;
     })();


     // *****************************************
     // Triggers / Events
     // ***************************************** 
     // Add item
     $('.add-to-cart').click(function(event) {
         event.preventDefault();
         var name = $(this).data('name');
         var img = $(this).data('img');
         var num = parseInt(window.localStorage.getItem(img))
         if (num === 1) {
             alert("Tin đã được lưu rồi!!")
             return;
         }
         if (typeof localStorage[img] === "undefined") {
             window.localStorage.setItem(img, 1)
             shoppingCart.addItemToCart(name, img, 1);
             displayCart();
         }



     });

     // Clear items
     $('.clear-cart').click(function() {
         shoppingCart.clearCart();
         window.localStorage.clear()
         displayCart();
     });


     function displayCart() {
         var cartArray = shoppingCart.listCart();
         var output = "";
         for (var i in cartArray) {
             output += "<tr>" +
                 "<td><img class='saveImg'  src=" + cartArray[i].img + "></td>" +

                 "<td><a class='saveTitle' href='#''>" + cartArray[i].name + "  </a></td>" +

                 "<td><button class='delete-item btn btn-danger bg-danger'  data-img=" + cartArray[i].img + ">X</button></td>" +
                 "</tr>";
         }
         $('.show-cart').html(output);
         $('.total-cart').html(shoppingCart.totalCart());
         $('.total-count').html(shoppingCart.totalCount());
     }

     // Delete item button

     $('.show-cart').on("click", ".delete-item", function(event) {
         var img = $(this).data('img')
         shoppingCart.removeItemFromCartAll(img);
         window.localStorage.removeItem(img)
         displayCart();
     })

     // Item count input
     $('.show-cart').on("change", ".item-count", function(event) {
         var name = $(this).data('name');
         var count = Number($(this).val());
         shoppingCart.setCountForItem(name, count);
         displayCart();
     });

     displayCart();

 })