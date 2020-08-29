# MyGarage
Name TBD. Single page webapp that allows users to track maintenance and parts for their vehicles

## Further Notes & Ideas
Allow users to enter all kinds of vehicles (boats/cars/trucks/atvs/etc)
    Have different classes of vehicles, under which we allow users to track different information
        Cars
            Last oil change (date/mileage)
            Last alignment
            For each mechanical part, allow user to enter information about replacement parts.
                E.G Someone replaced a shock with an aftermarket part on date XX/XX and mileage XXXXX
            Allow users to store receipts under a specific vehicle
            Allow users to see all store receipts and search by information in the receipt (OCR from the receipt organizer application?)
            Allow users to mark a part as needing replaced. Send them information about possible replacements in email or notifications
        Boats
            Last clean
            Last reseal
        RVs
            Allow scheduling winter storage maintenance
Scrap the web (summit, autozone, o'riellys) for possible replacement parts
Allow users to upload images of vehicles
Allow users to setup a profile

## Technical Information
Should be a cloud native application that uses docker containers and microservices.
Microservices may include
    authentication
    profile services
        user data and settings
    garage services
        storing different vehicles and data on each
    part searching
    receipt storage
    client webapp

