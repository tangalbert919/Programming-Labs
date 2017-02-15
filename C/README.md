# C Labs
--------------
This is a set of C Labs that I made. I'm teaching myself this language by using books and online resources (but the reliability for both is undetermined). The more famous C++ is based off of C, and it's a good idea to understand and be able to program in C before learning how to program in C++.

C is known best for low level memory management and having a bunch of built-in libraries to aid you in better handling of memory and hardware. Its efficiency is why kernels are written in C (like the famous [Linux kernel](https://github.com/torvalds/linux)), but it gets that efficiency by requiring you to perform low-level memory management by hand. The machine will be more efficient, but makes us humans less productive.

If you learn C++ first, it's not difficult to learn C, and vice versa. However, you are more productive the more you avoid programming in C (because we want to use our time efficiently, and C does not let you do that).

### Requirements
----------------
For Windows users (which is about 85% of PC users), you need to install a C compiler. Microsoft didn't think about adding that to their OS, but they bothered to add Xbox integration to Windows 10, and Windows 10 is over 10 GB large (when extracted from their ISO). To get the compiler, you need to install Cygwin, and the instructions are [here](http://preshing.com/20141108/how-to-install-the-latest-gcc-on-windows/). However, if you plan on using an IDE, then it's not required (theoretically).

For Mac users, you already have a compiler, and it's called "Clang". You just need an IDE to use it.

For Linux users, you have a bunch of compilers ready for use (GCC and G++). You can either use it from the Terminal or by using an IDE.

### IDEs for C
----------------
* [CLion](http://www.jetbrains.com/clion/) is a powerful and feature-rich IDE developed by [JetBrains](http://www.jetbrains.com/). You can learn more about it on their website.

* [Eclipse](http://www.eclipse.org) is a powerful IDE that supports many programming languages, but you need to install the [Oracle JDK](http://www.oracle.com/technetwork/java/javase/overview/index.html) in order to use it.

* Xcode is an IDE developed by Apple, and only works on macOS. It can only be found in the Mac App Store. [AppCode](http://www.jetbrains.com/objc/) is a smart IDE developed by [JetBrains](http://www.jetbrains.com), but requires Xcode for it to work.
