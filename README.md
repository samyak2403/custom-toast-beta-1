Here's a comprehensive `README.md` file for your **Custom Toast Library**:

---

# 🍞 TastyToast - Beautiful Custom Toast for Android  

A lightweight, elegant, and customizable toast library for Android with built-in icons and styles.  

![Demo](https://img.shields.io/badge/Demo-APK-blue)  
![Version](https://img.shields.io/badge/Version-1.0.0--Beta--1-orange)  
![License](https://img.shields.io/badge/License-Apache%202.0-green)  

## 📦 Installation  

### Step 1: Add JitPack to your project  
Add this to your **root** `build.gradle` (Project-level):  
```gradle
dependencyResolutionManagement {  
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)  
    repositories {  
        mavenCentral()  
        maven { url 'https://jitpack.io' }  
    }  
}  
```

### Step 2: Add the dependency  
In your **module-level** `build.gradle`:  
```gradle
dependencies {  
    implementation 'com.github.samyak2403:custom-toast-beta-1:1.0.0-Beta-1'  
}  
```

---

## 🚀 Usage  

### 1. Basic Toast  
```kotlin
TastyToast.show(context, "Hello World!", TastyToast.Type.SUCCESS)  
```

### 2. Using Extension Functions (Simpler!)  
```kotlin
// In Activity/Fragment  
tastySuccess("Success!")  
tastyError("Oops! Failed.")  
tastyWarning("Be careful!")  
tastyInfo("New update available.")  
tastyToast("Default toast")  
```

### 3. Custom Duration  
```kotlin
TastyToast.show(  
    context = this,  
    message = "This stays longer!",  
    type = TastyToast.Type.INFO,  
    duration = Toast.LENGTH_LONG // or Toast.LENGTH_SHORT  
)  
```

---

## 🎻 Toast Types  

| Type | Example |  
|------|---------|  
| **SUCCESS** | ✅ Operation successful |  
| **ERROR** | ❌ Failed to save data |  
| **WARNING** | ⚠️ Password too weak |  
| **INFO** | ℹ️ New message received |  
| **DEFAULT** | 💬 Default toast |  

*(Replace with actual screenshots in your repo!)*  

---

## 🛠️ Customization  

### Changing Icons & Backgrounds  
Override these in `res/drawable`:  
- `ic_success`, `ic_error`, `ic_warning`, `ic_info`, `ic_default`  
- `bg_toast_success`, `bg_toast_error`, etc.  

### Layout  
Modify `layout_custom_toast.xml` to change the toast design.  

---

## 📝 Example Code  

### Activity  
```kotlin
class MainActivity : AppCompatActivity() {  
    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_main)  

        // Basic  
        TastyToast.show(this, "Welcome!", TastyToast.Type.INFO)  

        // Extension  
        tastySuccess("Data saved successfully!")  
    }  
}  
```

### Fragment  
```kotlin
class HomeFragment : Fragment() {  
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {  
        super.onViewCreated(view, savedInstanceState)  

        tastyError("Network error!")  
    }  
}  
```

---

## 📜 License  
```text
Copyright 2023 Samyak Kamble 

Licensed under the Apache License, Version 2.0 (the "License");  
you may not use this file except in compliance with the License.  
You may obtain a copy of the License at  

   http://www.apache.org/licenses/LICENSE-2.0  

Unless required by applicable law or agreed to in writing, software  
distributed under the License is distributed on an "AS IS" BASIS,  
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
See the License for the specific language governing permissions and  
limitations under the License.  
```

---

## 🔗 Links  
- [Report Issues](https://github.com/samyak2403/custom-toast/issues)  
- [Contribute](https://github.com/samyak2403/custom-toast/pulls)  

---

### 🎉 Enjoy using **TastyToast**!  
Let me know if you'd like any modifications! 🚀
