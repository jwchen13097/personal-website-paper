package org.firefly.provider.personal.website.paper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Paper {
    private Integer id;
    private String title;
    private String content;
}
