# Rest-api-client

Company - Codtech IT Solutions
Name - Tanay Daata
Inter Id - CT04DL566
Domain - Java Programming
Duration - 4 Weeks
Mentor -  Mr. Muzammil Ahmed

# 🌦️ Java Weather Fetcher – REST API JSON Integration

## 📌 Project Overview

This project demonstrates how to build a **Java application** that consumes a **public REST API** (such as OpenWeatherMap) to fetch **real-time weather data**, parse the JSON response, and display it in a **clean, structured format** on the console.

The primary focus of this application is to help Java learners and developers understand how to:

* Perform HTTP GET requests in Java.
* Connect to RESTful web services.
* Parse JSON data from a response body.
* Handle common errors like network issues or malformed responses.

The **deliverable** is a standalone **Java application** that includes:

* HTTP request handling
* JSON parsing
* Structured data output

---

## ✅ Features

* 🔗 Fetches live weather data from a public API.
* 🔎 Parses JSON responses using a lightweight library.
* 📋 Displays data like temperature, humidity, wind, and description in a formatted output.
* 🧱 Modular Java code with separate functions for clarity.
* ⚠️ Handles errors such as invalid city names, API failures, or malformed data.
* 💬 Interactive command-line input for city names.


## 🧰 Tech Stack

* Java SE 8+
* `HttpURLConnection` (for making HTTP requests)
* `org.json.simple` or `org.json` for JSON parsing
* Public REST API (e.g., [OpenWeatherMap](https://openweathermap.org/api))

---

## ⚙️ How It Works

1. The program prompts the user to enter a **city name**.
2. It constructs a URL with the API endpoint and key.
3. Makes a **GET request** to the API.
4. Reads and parses the **JSON response**.
5. Extracts useful data like:

   * Temperature
   * Humidity
   * Weather Description
   * Wind Speed
   * Time (optional)
6. Displays this in a **human-readable format**.

---


## 📌 Sample Output

```
Enter City: London

========= WEATHER REPORT =========
City: London
Temperature: 18.2°C
Humidity: 65%
Description: Light Rain
Wind Speed: 4.2 m/s
Time: 2025-06-05T12:45:00Z
=================================


## 🔐 Error Handling

* Invalid API Key or URL
* City not found
* Empty or null responses
* Network connection failures
* JSON parsing issues

Each of these is handled gracefully with meaningful console messages.

---

## 💡 Use Cases

* Real-time weather data dashboards
* Weather bots or assistants
* Mobile backends
* Teaching JSON + REST + HTTP in Java

