
# react-native-custom-native-module

## Getting started

`$ npm install react-native-custom-native-module --save`

### Mostly automatic installation

`$ react-native link react-native-custom-native-module`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-custom-native-module` and add `RNCustomNativeModule.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCustomNativeModule.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNCustomNativeModulePackage;` to the imports at the top of the file
  - Add `new RNCustomNativeModulePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-custom-native-module'
  	project(':react-native-custom-native-module').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-custom-native-module/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-custom-native-module')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNCustomNativeModule.sln` in `node_modules/react-native-custom-native-module/windows/RNCustomNativeModule.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Custom.Native.Module.RNCustomNativeModule;` to the usings at the top of the file
  - Add `new RNCustomNativeModulePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNCustomNativeModule from 'react-native-custom-native-module';

// TODO: What to do with the module?
RNCustomNativeModule;
```
  