Contributers: Swapnil Kumar, Siddhant Agarwal, Anurag Wadhwa, Vandit Khanna
# Bhukkad2
fastracking the way you order food
# Overview 
How does it feel having received the order as soon as you enter the crowded Vigyan Kunj at midnight?
Or how good can a canteen owner feel receiving all the payments which he misses due to the crowd each day?
“Bhukkad”- an easy and convenient app for customers to order and pay for the order, before even reaching the canteen and enjoying the food with their loved ones.

# Problem Statement
The Canteens in different hostels of IIT - Roorkee face several problems due to non-payment of orders by students. Some of the common issues that they may encounter include:

Financial Losses: Non-payment of orders can result in financial losses for the canteen, as they have already incurred costs to purchase ingredients and prepare the food.

Negative impact on customer relationships or Loss of trust: If customers do not pay for their orders, it may lead to a loss of trust between the canteen and its customers, which can negatively impact the canteen's reputation and future business.

Inefficiency: When orders are not paid for, canteens may be forced to spend additional time and resources trying to track down the delinquent customers and collect payment. This can lead to inefficiency and can divert resources away from more important tasks. Also, it becomes a hectic task for canteen owners to remember the faces while delivering the orders.

Time Waste: Due to huge crowds during peak times there is a lot of time delay between orders and hence cause a lot of wastage of time which can be reduced by if one could place the order online.

Research: During a survey with the owners of Green Gala, Vigyan Kunj and Rajiv Bhawan Canteen we found out that the owners face losses due to non-payment of orders. There is a potential loss of around Rs 300-500 every day which is around 10k per month.


The Solution: We have developed an app Bhukkad which is a one-stop solution to all the problems. It allows the customers to place orders in any of the given canteens and they can make the payment from the app after ordering upon which the owner gets a notification of their confirmed order. This makes the process queue free, and efficient and solves a major problem of nonpayment in canteens.


Functional Requirements:
1. Canteen Owners onboarding 
2. Food and menu and pricing by canteen owners
3. User Registration 
4. Notifications for owners and customers  
5. Integration with Payment Gateway 
6. Order Handling and Checkout
7. Sales Report

# APIs Used: 
1. Sandbox environment of cash-free
2.OneSignal for Notifications 
3. Firebase Database for Backend
Programming Languages Used: Java and XML
IDE used: Android Studio, Firebase, Figma


# How will it Function - 
Overall, the functioning of a Bhukkad app involves a combination of front-end and back-end processes that are designed to make it easy and convenient for customers to order food and for the restaurant to manage and process orders.
1.	Front-end: It offers two types of login: One for the customers and the other for the canteen owners. 
Customers- After the login through email id and phone number, the customer will be directed to the page which allows him to choose the Bhawan canteen of his/her own choice. 

●	Login is connected to Firebase Utility as the backend.

●	After choosing the canteen, he/she will be able to see the menu of the canteen along with the price of each item. 

●	On selecting the item, he will be directed to the checkout page, where he/she will be able to see the item with the price total. To add more to the order, he/she can choose the option of ‘Add more’ or else choose ‘Checkout’.

●	On checking out, it will redirect to the payment gateway which allows customers to make payments.

●	Payment Gateway Working-When a payment is incurred a checksum is sent to cash free which in response generates a token to authorize the payment.

●	On confirming the payment, the notification of the order will be received by the canteen owner as well as the customer and the customer will be redirected to the home page.
The owner will give the order to the customer only after confirming through the notification. This allows the owner to receive the payment before the order and makes the delivery process more efficient and transparent. 

Canteen Owner-  After the login, canteen owners will be able to see the menu page along with the price. It allows them to edit the menu (add or delete the item along with their respective prices). 


2.	Back-end: 
●	We have used Firebase cloud-based backend server. It is No SQL-type real-time database system that collects the user mail ids. 

●	Along with this, it will also collect the menu along with prices of different canteens. We integrated this database with the Android studio. 

●	We have also used the cloud-based messaging by Firebase and One Signal to push notifications to customers and canteen owners for efficient working on orders.

●	Google Analytics allows us to track the daily sales of canteens through the app.



Logo and Design - 

A “food” ordering app in India cannot get a better name than Bhukkad. 
Research shows that red is eye-catching and triggers appetite. It is particularly useful in design, probably because the color indicates ripeness or sweetness in natural foods like berries. Also, most of the food ordering apps like Zomato, Pizza Hut, McDonald’s, KFC, and Dominos have their logo or theme in red. So the color selection of the logo and theme. 
Also, according to research, Burgers are one of the most ordered fast foods in the world. Hence the inspiration for the burger inside B is recognized. The curve of B looks like the curvature of the bun of a burger. 
FIGMA LINK - https://www.figma.com/file/PCTBH5HIm2cHVwf2ZtgYm9/Figma-mobile-design?node-id=0%3A3&t=3h0CuvLvxNBoBIUu-1

