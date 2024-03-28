package run.freshr.common.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Elasticsearch 설정
 *
 * @author FreshR
 * @apiNote Elasticsearch 설정
 * @since 2024. 3. 28. 오전 9:49:22
 */
@Configuration
@EnableElasticsearchRepositories("**.**.domain.**.repository.elasticsearch")
public class ElasticsearchConfiguration {

}
