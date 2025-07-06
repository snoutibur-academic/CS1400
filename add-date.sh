#!/bin/bash

# Change this if you want a different comment format
HEADER_PATTERN='^/\*[\s\*]*Last modified:'

# Find all Java files
find . -type f -name '*.java' | while read -r file; do
  # Get last modified date
  mod_date=$(date -r "$file" +%Y-%m-%d)

  # If the file already has a header, replace it
  if grep -q "$HEADER_PATTERN" "$file"; then
    # Replace the line
    sed -i "s|$HEADER_PATTERN.*|/* Last modified: $mod_date */|" "$file"
  else
    # Insert at the top
    {
      echo "/* Last modified: $mod_date */"
      echo
      cat "$file"
    } > "$file.tmp" && mv "$file.tmp" "$file"
  fi
done
