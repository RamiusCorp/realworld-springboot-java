package io.github.raeperd.realworld.domain.article;

import org.springframework.data.domain.*;
import java.time.*;
import java.util.*;
import java.util.Optional;

public interface ArticleFindService {

    Optional<Article> getArticleBySlug(String slug);
}
