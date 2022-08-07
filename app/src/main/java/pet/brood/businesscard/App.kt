package pet.brood.businesscard

import android.app.Application
import pet.brood.businesscard.data.AppDatabase
import pet.brood.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}