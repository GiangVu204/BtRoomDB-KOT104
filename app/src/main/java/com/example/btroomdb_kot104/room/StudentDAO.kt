package com.kot104.btroomdb_kot104.room

import androidx.contentpager.content.Query
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDAO {

    @Insert
    suspend fun addStudent(studentEntity: StudentEntity)

    @androidx.room.Query("SELECT * FROM StudentEntity")
    fun getALlStudents(): Flow<List<StudentEntity>>

    @Delete
    suspend fun deleteStudent(studentEntity: StudentEntity)

    @Update
    suspend fun updateStudent(studentEntity: StudentEntity)
}