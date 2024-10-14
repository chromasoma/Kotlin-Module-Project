class Archive(var name: String) {
      var notes: MutableMap<Note> = mutableMapOf()
      fun addNote(note: Note)
      {
          notes[notes.size] = note
      }

      fun showNotes()
      {
          println(notes.map{ "${it.key} ${it.value}" }.joinToString("\n"))
      }
}