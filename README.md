Here's a comprehensive `README.md` file for your **Custom Toast Library**:

---

# 🍞 TastyToast - Beautiful Custom Toast for Android  

A lightweight, elegant, and customizable toast library for Android with built-in icons and styles.  

![Demo](https://img.shields.io/badge/Demo-APK-blue)  
![Version](https://img.shields.io/badge/Version-1.0.0--Beta--1-orange)  
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
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
MIT License

Copyright (c) 2025 Samyak Kamble

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## 🔗 Links  
- [Report Issues](https://github.com/samyak2403/custom-toast/issues)  
- [Contribute](https://github.com/samyak2403/custom-toast/pulls)  

---

### 🎉 Enjoy using **TastyToast**!  
Let me know if you'd like any modifications! 🚀
