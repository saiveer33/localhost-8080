<?php
$str = "Hello World";

// a) Find the length of a string
echo "Length of string: " . strlen($str) . "<br>";

// b) Count number of words
echo "Number of words: " . str_word_count($str) . "<br>";

// c) Reverse a string
echo "Reverse string: " . strrev($str) . "<br>";

// d) Search for a specific string
$search = "World";

if (strpos($str, $search) !== false) {
    echo "String found";
} else {
    echo "String not found";
}
?>
