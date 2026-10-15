📱 MAD Lab Experiment 02 – Android Activity Lifecycle
An Android application developed using Kotlin to demonstrate the Android Activity Lifecycle. This experiment displays the lifecycle callbacks (onCreate(), onStart(), onResume(), onPause(), onStop(), onRestart(), and onDestroy()) using Toast messages and Logcat, helping understand how an Activity behaves during different user interactions.

📖 About the Project
The Android Activity Lifecycle defines how an activity is created, started, resumed, paused, stopped, restarted, and destroyed.

This application demonstrates every lifecycle method by displaying a Toast message and writing logs whenever the activity changes its state.

The project is developed as Experiment 2 for the Mobile Application Development (MAD) Laboratory.

✨ Features
📱 Single Activity Application
💻 Developed using Kotlin
🔄 Demonstrates all Android Activity Lifecycle methods
🍞 Displays lifecycle callbacks using Toast messages
📄 Lifecycle events shown in Logcat
🎨 Simple and user-friendly interface
📲 Successfully tested on Android Emulator
📚 Activity Lifecycle Methods Demonstrated
Method	Description
onCreate()	Called when the Activity is first created
onStart()	Called when the Activity becomes visible
onResume()	Called when the Activity comes to the foreground
onPause()	Called when another Activity partially covers it
onStop()	Called when the Activity is no longer visible
onRestart()	Called before restarting a stopped Activity
onDestroy()	Called before the Activity is destroyed
🛠️ Technologies Used
Component	Version
Language	Kotlin
IDE	Android Studio
Minimum SDK	24
Target SDK	36
Compile SDK	36
Android Gradle Plugin	Latest
UI	ConstraintLayout
Libraries Used
AndroidX Core KTX
AppCompat
Activity KTX
ConstraintLayout
Material Components
📂 Project Structure
MAD-Lab-Experiment-02-Android-Activity-Lifecycle/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/
│   │   │   │      └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │      ├── layout/activity_main.xml
│   │   │   │      ├── values/
│   │   │   │      └── mipmap/
│   │   │   └── AndroidManifest.xml
│   │
│   ├── build.gradle.kts
│   └── proguard-rules.pro
│
├── screenshots/
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
🚀 Getting Started
Prerequisites
Before running the project, make sure you have:

Android Studio (Latest Stable Version)
Android SDK
Android Emulator or Physical Android Device
Gradle (Automatically downloaded)
⚙️ Installation
1. Clone the Repository
git clone https://github.com/<your-username>/MAD-Lab-Experiment-02-Android-Activity-Lifecycle.git
2. Open Android Studio
Click Open
Select the project folder
3. Sync Gradle
Wait until Gradle downloads all required dependencies.

4. Run the Project
Click the ▶ Run button and select an emulator or connected Android device.

📸 Screenshots
Main Screen Toast Message Logcat Output

Main Screen          Toast Message          Logcat Output

---
▶️ How to Test the Lifecycle
Perform the following actions and observe the lifecycle methods:

Launch the app
Press the Home button
Return to the app
Rotate the device
Press the Back button
Open another application
Observe the Toast messages and Logcat output corresponding to each lifecycle callback.

🎯 Expected Output
The application successfully displays the Android Activity Lifecycle methods through Toast messages and Logcat, allowing users to understand the sequence of lifecycle callbacks during different activity states.

🎓 Academic Information
Course: Master of Computer Applications (MCA)

Subject: Mobile Application Development Laboratory

Experiment: 02 – Android Activity Lifecycle

University: Jain (Deemed-to-be University)

Campus: JGI Knowledge Campus, Jayanagar, Bengaluru

👨‍💻 Author
Name: Vishwajeet Singh

USN: 25MCAR0219

Course: Master of Computer Applications (MCA)

Department: MCA

College: Jain (Deemed-to-be University)

Campus: JGI Knowledge Campus, Jayanagar, Bengaluru

📄 License
This project is created for educational purposes as part of the Mobile Application Development (MAD) Laboratory at Jain (Deemed-to-be University). It is free to use for learning and academic reference.

⭐ If you found this project useful, don't forget to star the repository.
