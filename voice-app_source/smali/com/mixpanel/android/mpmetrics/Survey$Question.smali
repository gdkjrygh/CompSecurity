.class public Lcom/mixpanel/android/mpmetrics/Survey$Question;
.super Ljava/lang/Object;
.source "Survey.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/Survey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Question"
.end annotation


# instance fields
.field private final mChoices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mPrompt:Ljava/lang/String;

.field private final mQuestionId:I

.field private final mQuestionType:Ljava/lang/String;

.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/Survey;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;)V
    .locals 7
    .param p2, "question"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
        }
    .end annotation

    .prologue
    .line 116
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->this$0:Lcom/mixpanel/android/mpmetrics/Survey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    const-string v4, "id"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mQuestionId:I

    .line 118
    const-string v4, "type"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mQuestionType:Ljava/lang/String;

    .line 119
    const-string v4, "prompt"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mPrompt:Ljava/lang/String;

    .line 121
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 122
    .local v1, "choicesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v4, "extra_data"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 123
    const-string v4, "extra_data"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 124
    .local v2, "extraData":Lorg/json/JSONObject;
    const-string v4, "$choices"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 125
    const-string v4, "$choices"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 126
    .local v0, "choices":Lorg/json/JSONArray;
    new-instance v1, Ljava/util/ArrayList;

    .end local v1    # "choicesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .restart local v1    # "choicesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v3, v4, :cond_1

    .line 132
    .end local v0    # "choices":Lorg/json/JSONArray;
    .end local v2    # "extraData":Lorg/json/JSONObject;
    .end local v3    # "i":I
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mChoices:Ljava/util/List;

    .line 133
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/Survey$Question;->getType()Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    move-result-object v4

    sget-object v5, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    if-ne v4, v5, :cond_2

    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mChoices:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_2

    .line 134
    new-instance v4, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Question is multiple choice but has no answers:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 128
    .restart local v0    # "choices":Lorg/json/JSONArray;
    .restart local v2    # "extraData":Lorg/json/JSONObject;
    .restart local v3    # "i":I
    :cond_1
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 136
    .end local v0    # "choices":Lorg/json/JSONArray;
    .end local v2    # "extraData":Lorg/json/JSONObject;
    .end local v3    # "i":I
    :cond_2
    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/Survey$Question;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
        }
    .end annotation

    .prologue
    .line 116
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/Survey$Question;-><init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public getChoices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 147
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mChoices:Ljava/util/List;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 139
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mQuestionId:I

    return v0
.end method

.method public getPrompt()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
    .locals 2

    .prologue
    .line 151
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mQuestionType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    .line 157
    :goto_0
    return-object v0

    .line 154
    :cond_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->TEXT:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Survey$Question;->mQuestionType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->TEXT:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    goto :goto_0

    .line 157
    :cond_1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    goto :goto_0
.end method
