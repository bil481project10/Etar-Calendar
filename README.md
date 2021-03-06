![Etar Calendar](metadata/en-US/images/featureGraphic.png)
# Etar Calendar
Etar (from Arabic:  `إِيتَار`)  is an open source material designed calendar made for everyone!

[![](metadata/en_fdroid.png)](https://f-droid.org/packages/ws.xsoh.etar/)[![](metadata/en_google_play.png)](https://play.google.com/store/apps/details?id=ws.xsoh.etar)

![Etar Calendar](metadata/animation.gif)

## Why?
Well, I wanted a simple, material designed and state of the art open source calendar that anyone can make better.

## Special thanks

The application is an enhanced version of AOSP Calendar. Without the help of
[Free Software for Android](https://github.com/Free-Software-for-Android/Standalone-Calendar) team, 
this app would be just a dream. So thanks to them!

## Features
- Month view.
- Week, day & agenda view.
- Uses Android calendar sync. Works with Google Calendar, Exchange, etc.
- Material designed.
- Agenda widget.

## Contribute
### Translations in Google Play app description
You can update/add your own language [here](metadata). Also, all artwork files are available [here](metadata)

### Build instructions
Install and extract Android SDK command line tools.
```
tools/bin/sdkmanager platform-tools
export ANDROID_HOME=/path/to/android-sdk/
git submodule update --init --remote
gradle build
```

### How this was done
- see ``build.gradle`` and the modifications to ``AndroidManifest.xml``
- ``fix_strings_and_import.py`` was created to fix a build problem and rename imports of R.java
- get time zone data from http://www.iana.org/time-zones write ``backward`` and ``zone.tab`` to assets and to assets of https://github.com/dschuermann/standalone-calendar-timezonepicker
- comment out code in https://github.com/dschuermann/standalone-calendar-frameworks-ex


The calendar shows Montly, Dayly, Weekly 
schedules and this commit is made by Aybuke Kucukbezirci..

The commit is made by Deniz

This is our repository for Bil481 project and this commit made by Dilan Dogan
