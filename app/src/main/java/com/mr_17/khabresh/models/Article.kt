package com.mr_17.khabresh.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
) : java.io.Serializable {

    override fun hashCode(): Int {
        var result = id.hashCode()
        if(url?.isEmpty() == true){
            result = 31 * result + url.hashCode()
        }
        return result
    }
}