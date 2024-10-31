# Landmark Explorer

Landmark Explorer is an Android application designed to help users explore notable landmarks around them. Users can register and log in to view a curated list of landmarks in their area, read detailed information about each landmark, pinpoint their current location, and calculate the distance to landmarks they wish to explore.

## Features

- **User Registration and Login**: Users can create an account and log in securely to access the app.
- **Landmark Information**: Browse and view information about various landmarks available in a specific area.
- **Location Pinpointing**: Users can pinpoint their current location on the app to get accurate distance calculations.
- **Distance Calculation**: Calculate the distance between the user's location and selected landmarks.

## Technologies Used

- **Language**: Java
- **Platform**: Android (developed in Android Studio)
- **Libraries**:
  - **Firebase**: Authentication and data storage (optional for user registration and login)
  - **Google Maps API**: Used for mapping, location pinpointing, and distance calculations
  - **Location Services**: Retrieves user location data

---

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/landmark-explorer.git
   cd landmark-explorer
   ```

2. **Open in Android Studio**:
   - Open Android Studio and select `Open an existing project`.
   - Navigate to the folder where you cloned the repository and select it.

3. **Set Up API Keys**:
   - Obtain an API key from the [Google Cloud Console](https://console.cloud.google.com/) for the Google Maps API.
   - Enable **Maps SDK for Android** and **Location Services** in the Google Cloud Console.
   - Add your API key to your project by including it in the `AndroidManifest.xml` file:
     ```xml
     <meta-data
         android:name="com.google.android.geo.API_KEY"
         android:value="YOUR_API_KEY_HERE"/>
     ```

4. **Build and Run**:
   - Sync your project with Gradle files.
   - Run the app on an emulator or a connected device.

---

## Usage

### 1. User Registration & Login

   - **Registration**: Users can create a new account by providing an email and password.
   - **Login**: Registered users can log in securely to access the landmark exploration features.
   - Authentication can be handled using Firebase Authentication for easy and secure management (optional).

### 2. Exploring Landmarks

   - **Browse Landmarks**: Once logged in, users can explore a list of landmarks within the designated area.
   - **Landmark Details**: Each landmark listing contains detailed information, including history, significance, and nearby attractions.
   - **Search Landmarks**: Users can search landmarks by name or browse by category, such as historical sites, parks, monuments, etc.

### 3. Location Pinpointing

   - **Pinpoint User Location**: With location permissions enabled, users can see their current location on the map.
   - **Map View**: The app utilizes the Google Maps API to display a map with the user's current location and nearby landmarks.

### 4. Distance Calculation

   - **Select Landmark for Distance**: Users can select a landmark to view the calculated distance from their current location.
   - **Distance Display**: The app calculates the distance (in kilometers or miles) between the user's current location and the selected landmark using the Haversine formula.
   - **Distance Updates**: As the user's location changes, the app dynamically updates the distance.

---

## App Structure

```plaintext
src/
│
├── com.example.landmarkexplorer/
│   ├── activities/
│   │   ├── LoginActivity.java
│   │   ├── RegisterActivity.java
│   │   ├── LandmarkListActivity.java
│   │   ├── LandmarkDetailsActivity.java
│   │   ├── MapActivity.java
│   │
│   ├── adapters/
│   │   └── LandmarkAdapter.java
│   │
│   ├── models/
│   │   └── Landmark.java
│   │
│   ├── utils/
│   │   ├── LocationHelper.java
│   │   └── DistanceCalculator.java
│   │
│   ├── res/
│   │   ├── layout/
│   │   ├── drawable/
│   │   └── values/
│   │
├── AndroidManifest.xml
└── build.gradle
```

### Key Files

- **LoginActivity.java**: Handles user login.
- **RegisterActivity.java**: Handles new user registration.
- **LandmarkListActivity.java**: Displays the list of landmarks in the area.
- **LandmarkDetailsActivity.java**: Shows detailed information about the selected landmark.
- **MapActivity.java**: Contains map logic for location pinpointing and displays distance to landmarks.
- **LocationHelper.java**: Utility class to manage location services.
- **DistanceCalculator.java**: Utility class to calculate the distance between the user and landmarks.

---

## Future Enhancements

- **User Reviews**: Add functionality for users to leave reviews or rate landmarks.
- **Offline Mode**: Cache landmark data for offline use.
- **Directions**: Integrate Google Maps directions to guide users to landmarks.
- **Augmented Reality (AR)**: Incorporate AR to enhance the exploration experience by allowing users to view landmarks in real-time.

---

## Permissions Required

Ensure the app has the following permissions in `AndroidManifest.xml` for a smooth experience:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
```

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and open a pull request. For major changes, please open an issue to discuss what you would like to change.

---

