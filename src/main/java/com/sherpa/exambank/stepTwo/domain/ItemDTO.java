package com.sherpa.exambank.stepTwo.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class ItemDTO {
    private int itemNo;
    private Long itemId;
    private String questionFormCode;
    private String questionFormName;
    private String difficultyCode;
    private String difficultyName;
    private Long largeChapterId;
    private String largeChapterName;
    private Long mediumChapterId;
    private String mediumChapterName;
    private Long smallChapterId;
    private String smallChapterName;
    private Long topicChapterId;
    private String topicChapterName;
    private Long passageId;
    private String passageUrl;
    private String questionUrl;
    private String answerUrl;
    private String explainUrl;


}
