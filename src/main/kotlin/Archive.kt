class Archive(var name: String) {
      var notes: MutableMap<Note> = mutableMapOf()
      fun addNote(note: Note)
      {
          notes[notes.size] = note
      }

      fun showNotes()
      {
          notes
      }
}