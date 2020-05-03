using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Custom.Native.Module.RNCustomNativeModule
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNCustomNativeModuleModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNCustomNativeModuleModule"/>.
        /// </summary>
        internal RNCustomNativeModuleModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNCustomNativeModule";
            }
        }
    }
}
