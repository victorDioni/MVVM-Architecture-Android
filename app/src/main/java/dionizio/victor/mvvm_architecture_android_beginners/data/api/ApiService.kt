package dionizio.victor.mvvm_architecture_android_beginners.data.api

import dionizio.victor.mvvm_architecture_android_beginners.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}