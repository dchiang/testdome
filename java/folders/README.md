# [Folders](https://www.testdome.com/questions/java/folders/35600 "Folders")

Implement a function folderNames, which accepts a string containing an XML file that specifies folder structure and returns all folder names that start with startingLetter. The XML format is given in the example below.

For example, for the letter 'u' and an XML file:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<folder name="c">
    <folder name="program files">
        <folder name="uninstall information" />
    </folder>
    <folder name="users" />
</folder>
```

the function should return a collection with items "uninstall information" and "users" (in any order).

### Test Cases

* Example case.
* All folder names start with starting letter.
* Complicated folder structure.
