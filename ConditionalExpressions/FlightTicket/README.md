
Make a program that calculates air ticket prices according to distance and conditions with Java. Get Distance (KM), age and trip type (One Way, Round-Round) information from the user. Take the fare per distance as 0.10 TL / km. First, calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;

- Values received from the user must be valid (distance and age values are positive numbers, trip type is 1 or 2). Otherwise, 'You Have Entered Wrong Data!' A warning should be given.
- If the person is under 12 years old, **50%** discount is applied on the ticket price.
- If the person is between the ages of 12-24, **10%** discount is applied on the ticket price.
- If the person is over 65 years old, **30%** discount is applied on the ticket price.
- If the person has chosen the "Journey Type" **round trip**, **20%** discount is applied on the ticket price.

## Clue

- Normal Amount = Distance * 0.10 = 1500 * 0.10 = 150 TL
- Age Discount = Normal Amount * Age Discount Rate = 150 * 0.10= 15 TL
- Discounted Amount = Normal Amount – Age Discount = 150 – 15 = 135 TL
- Round-trip Ticket Discount = Discounted Amount * 0.20 = 135 * 0.20 = 27 TL
- Total Amount = (135-27)* 2 = 216 TL

## Scenarios

### Scenario 1

Enter the distance in km: 1500
Enter your age : 20
Enter the type of trip (1 => One Way , 2 => Round Trip ): 2

Total Amount = 216 TL

### Scenario 2

Enter the distance in km: -500
Enter your age : 1
Enter the type of trip (1 => One Way, 2 => Round Trip): 77

You Entered Wrong Data!

### Scenario 3

Enter the distance in km: 200
Enter your age : 35
Enter the type of trip (1 => One Way, 2 => Round Trip): 1

Total Amount = 20.0 TL