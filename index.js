
import { NativeModules } from 'react-native';

const { RNOnePlusOne } = NativeModules;

export default { addOne: RNOnePlusOne && RNOnePlusOne.addOne }
