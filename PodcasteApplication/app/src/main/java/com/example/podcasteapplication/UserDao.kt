package com.example.podcasteapplication
import androidx.room.*

@Dao
interface UserDao {

    @Query("SELECT * FROM user_table WHERE email = :email")
    suspend fun getUserByEmail(email: String): user?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: user)

    @Update
    suspend fun updateUser(user: user)

    @Delete
    suspend fun deleteUser(user: user)
}
