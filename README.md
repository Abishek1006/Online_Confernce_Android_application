```markdown
# 📱 Online Confernce- Android Live Streaming App

**Online Conference** is an Android-based live streaming application that allows users to host and join live streaming sessions. Built with **Firebase authentication** and **ZEGOCLOUD's streaming capabilities**, it provides a seamless live streaming experience.

---

## 🌟 Features

- **User Authentication**: Secure login and registration using Firebase.
- **Live Streaming**: Host and join live streams with ZEGOCLOUD.
- **Host/Viewer Roles**: Switch between hosting and viewing modes.
- **Profile Management**: Manage user profiles and settings.
- **Real-time Interaction**: Engage with viewers or hosts in real-time.

---

## 📸 Screenshots

[Add your screenshots here]

---

## 🛠️ Tech Stack

- **Java**: Primary programming language.
- **Firebase Authentication**: For secure user authentication.
- **ZEGOCLOUD UI Kit**: For live streaming capabilities.
- **Android SDK**: Core framework for Android development.
- **Gradle**: Build automation tool.

---

## 🚀 Prerequisites

- **Android Studio Arctic Fox** or later.
- **JDK 8** or higher.
- **Android device/emulator** running Android 5.0 (API 21) or higher.
- **Active Firebase account**.
- **ZEGOCLOUD account**.

---

## 🛠️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/MyApplication.git
```

### 2. Firebase Configuration
1. Create a new Firebase project at [Firebase Console](https://console.firebase.google.com/).
2. Add an Android app with the package name `com.example.myapplication`.
3. Download the `google-services.json` file.
4. Place the `google-services.json` file in the `app` directory.

### 3. ZEGOCLOUD Setup
1. Sign up for a [ZEGOCLOUD account](https://zegocloud.com/).
2. Obtain your **AppID** and **AppSign**.
3. Update these credentials in your app.

### 4. Build and Run
1. Open the project in **Android Studio**.
2. Sync Gradle files.
3. Build the project.
4. Run on an emulator or physical device.

---

## 📂 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/myapplication/
│   │   │   ├── LiveActivity.java
│   │   │   ├── MainActivity.java
│   │   │   ├── MainUI.java
│   │   │   └── ...
│   │   └── res/
│   └── androidTest/
└── build.gradle
```

---

## 📦 Dependencies

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'com.google.firebase:firebase-auth:22.3.1'
    implementation 'com.github.ZEGOCLOUD:zego_uikit_prebuilt_live_streaming_android'
    implementation 'com.google.code.gson:gson:2.8.8'
}
```

---

## ⚙️ Configuration

The app uses the following configuration from `google-services.json`:

- **Project ID**: `login-register-project-b9528`
- **Package Name**: `com.example.myapplication`

---

## 🤝 Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

---

## 📞 Contact

Your Name - [@Abishek](https://github.com/Abishek1006)  

---
