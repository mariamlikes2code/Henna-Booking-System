# Mehndi by Mariam — Henna Artistry Booking System

A Java console application that allows users to interact with a henna artistry brand's booking system. Built as a personal project to practice object-oriented programming concepts.

## Features

- Browse henna styles, placements, and complexities with pricing
- Book a henna appointment with date and time validation
- View all booked appointments
- Cancel an appointment by name
- View your client profile
- Conflict detection to prevent double-booking

## How to Run

1. Clone the repository
2. Open the project in your preferred Java IDE (Eclipse, IntelliJ, etc.)
3. Run `Main.java`

## Project Structure

| File | Description |
|------|-------------|
| `Main.java` | Entry point; handles the menu loop and user input |
| `BookingManager.java` | Manages the list of appointments |
| `Appointment.java` | Represents a single appointment |
| `Client.java` | Stores client contact info |
| `BeautyService.java` | Abstract parent class for services |
| `HennaService.java` | Extends `BeautyService` with henna-specific details |
| `DesignType.java` | Pairs a style with a description and price |
| `Style.java` | Enum of henna styles with pricing |
| `Placement.java` | Enum of body placements with pricing |
| `Complexity.java` | Enum of design complexities with pricing |
| `AppointmentStatus.java` | Enum for appointment status (PENDING, CONFIRMED, CANCELLED) |

## Concepts Used

- Inheritance and abstract classes (`BeautyService` → `HennaService`)
- Enums with fields and methods
- ArrayList and iteration
- Input validation with regex
- File I/O (`BufferedReader` for About Us section)
- Exception handling (`InputMismatchException`, `IOException`)

## Author

Mariam — [@mariamlikes2code](https://github.com/mariamlikes2code)
