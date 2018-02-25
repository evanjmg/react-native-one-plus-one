
# react-native-one-plus-one

## Getting started

`$ npm install react-native-one-plus-one --save`

### Mostly automatic installation

`$ react-native link react-native-one-plus-one`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import evanjmg.RNOnePlusOnePackage;` to the imports at the top of the file
  - Add `new RNOnePlusOnePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-one-plus-one'
  	project(':react-native-one-plus-one').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-one-plus-one/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-one-plus-one')
  	```


## Usage
```javascript
import RNOnePlusOne from 'react-native-one-plus-one';

// TODO: What to do with the module?
RNOnePlusOne;
```
  