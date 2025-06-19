# Music Management App

This is a Java desktop application for managing a local music library. It allows users to add, remove, and play songs, as well as create and manage playlists through a graphical user interface.

## Features

- Add and remove songs from the library
- Play music directly from the application
- Create and manage playlists
- Import songs from directories or ZIP files
- Simple and user-friendly GUI using Java Swing

## Project Structure

Main files:

- `Main.java`: Entry point of the application
- `MusicManagementGUI.java`: Handles the graphical interface
- `MusicPlayer.java`: Manages music playback
- `Playlist.java`: Represents and manages playlists
- `Song.java`: Represents individual songs
- `MusicFileUtil.java`: Handles file operations like reading and importing music

Folders:

- `lib/`: External libraries
- `resources/`: Icons and configuration files
- `ZusaetzlicheDokument/`: Additional project documentation

## Requirements

- Java 11 or higher
- Maven for building and running the project

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/Musikverwaltung.git
cd Musikverwaltung2
Build and run the project using Maven:

bash
Kopieren
Bearbeiten
mvn clean install
mvn exec:java -Dexec.mainClass="your.package.Main"
Make sure to replace your.package.Main with the actual path to your Main.java class if necessary.

Notes
This project was created as part of a university assignment. It helped me practice Java Swing, file handling, and working with multiple classes in a structured way.
