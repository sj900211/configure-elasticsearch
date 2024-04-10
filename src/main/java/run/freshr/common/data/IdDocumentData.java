package run.freshr.common.data;

import static lombok.AccessLevel.PROTECTED;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ID 모델
 *
 * @param <ID> type parameter
 * @author FreshR
 * @apiNote ID 모델
 * @since 2024. 3. 28. 오전 9:49:49
 */
@Getter
@NoArgsConstructor(access = PROTECTED)
public class IdDocumentData<ID> {

  private ID id;

  @Builder
  public IdDocumentData(ID id) {
    this.id = id;
  }

}
