.class public final Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;
.super Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
.source "UpdateDisplayState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SurveyState"
.end annotation


# static fields
.field private static final ANSWERS_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY"

.field private static final BACKGROUND_COMPRESSED_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;",
            ">;"
        }
    .end annotation
.end field

.field private static final HIGHLIGHT_COLOR_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY"

.field private static final SURVEY_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY"

.field public static final TYPE:Ljava/lang/String; = "SurveyState"


# instance fields
.field private final mAnswers:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

.field private mBackground:Landroid/graphics/Bitmap;

.field private mHighlightColor:I

.field private final mSurvey:Lcom/mixpanel/android/mpmetrics/Survey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 111
    new-instance v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState$1;-><init>()V

    .line 110
    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 207
    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "in"    # Landroid/os/Bundle;

    .prologue
    const/4 v2, 0x0

    .line 183
    invoke-direct {p0, v2}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;-><init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;)V

    .line 184
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mHighlightColor:I

    .line 185
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mAnswers:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    .line 187
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 188
    .local v0, "backgroundCompressed":[B
    if-eqz v0, :cond_0

    .line 189
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    .line 194
    :goto_0
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/Survey;

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mSurvey:Lcom/mixpanel/android/mpmetrics/Survey;

    .line 195
    return-void

    .line 191
    :cond_0
    iput-object v2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;)V
    .locals 0

    .prologue
    .line 183
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/Survey;)V
    .locals 2
    .param p1, "survey"    # Lcom/mixpanel/android/mpmetrics/Survey;

    .prologue
    const/4 v1, 0x0

    .line 125
    invoke-direct {p0, v1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;-><init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;)V

    .line 126
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mSurvey:Lcom/mixpanel/android/mpmetrics/Survey;

    .line 127
    new-instance v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mAnswers:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    .line 128
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mHighlightColor:I

    .line 129
    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    .line 130
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 163
    const/4 v0, 0x0

    return v0
.end method

.method public getAnswers()Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mAnswers:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    return-object v0
.end method

.method public getBackground()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getHighlightColor()I
    .locals 1

    .prologue
    .line 149
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mHighlightColor:I

    return v0
.end method

.method public getSurvey()Lcom/mixpanel/android/mpmetrics/Survey;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mSurvey:Lcom/mixpanel/android/mpmetrics/Survey;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 158
    const-string v0, "SurveyState"

    return-object v0
.end method

.method public setBackground(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "background"    # Landroid/graphics/Bitmap;

    .prologue
    .line 133
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    .line 134
    return-void
.end method

.method public setHighlightColor(I)V
    .locals 0
    .param p1, "highlightColor"    # I

    .prologue
    .line 137
    iput p1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mHighlightColor:I

    .line 138
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 168
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 169
    .local v2, "out":Landroid/os/Bundle;
    const-string v3, "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY"

    iget v4, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mHighlightColor:I

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 170
    const-string v3, "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY"

    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mAnswers:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 172
    const/4 v0, 0x0

    .line 173
    .local v0, "backgroundCompressed":[B
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_0

    .line 174
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 175
    .local v1, "bs":Ljava/io/ByteArrayOutputStream;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mBackground:Landroid/graphics/Bitmap;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x14

    invoke-virtual {v3, v4, v5, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 176
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 178
    .end local v1    # "bs":Ljava/io/ByteArrayOutputStream;
    :cond_0
    const-string v3, "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 179
    const-string v3, "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY"

    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->mSurvey:Lcom/mixpanel/android/mpmetrics/Survey;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 180
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 181
    return-void
.end method
