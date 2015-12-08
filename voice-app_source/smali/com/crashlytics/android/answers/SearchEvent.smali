.class public Lcom/crashlytics/android/answers/SearchEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "SearchEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/SearchEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final QUERY_ATTRIBUTE:Ljava/lang/String; = "query"

.field static final TYPE:Ljava/lang/String; = "search"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;-><init>()V

    return-void
.end method


# virtual methods
.method getPredefinedType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    const-string v0, "search"

    return-object v0
.end method

.method public putQuery(Ljava/lang/String;)Lcom/crashlytics/android/answers/SearchEvent;
    .locals 2
    .param p1, "query"    # Ljava/lang/String;

    .prologue
    .line 19
    iget-object v0, p0, Lcom/crashlytics/android/answers/SearchEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "query"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    return-object p0
.end method
