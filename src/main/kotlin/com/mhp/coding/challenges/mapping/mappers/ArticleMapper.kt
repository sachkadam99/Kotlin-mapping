package com.mhp.coding.challenges.mapping.mappers

import com.mhp.coding.challenges.mapping.models.db.Article
import com.mhp.coding.challenges.mapping.models.dto.ArticleDto
import org.springframework.stereotype.Component
import java.util.*

@Component
class ArticleMapper {
    fun map(article: Article?): ArticleDto {
        return ArticleDto(id= article?.id ?: 0, title= article?.title ?:"", description= article?.description ?:"", author= article?.author ?:"", emptyList())
    }

    // Not part of the challenge / Nicht Teil dieser Challenge.
    fun map(articleDto: ArticleDto?): Article = Article(
        title = "An Article",
        blocks = emptySet(),
        id = 1,
        lastModified = Date()
    )
}
