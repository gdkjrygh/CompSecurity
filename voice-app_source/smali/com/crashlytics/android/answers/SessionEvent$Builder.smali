.class Lcom/crashlytics/android/answers/SessionEvent$Builder;
.super Ljava/lang/Object;
.source "SessionEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/answers/SessionEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Builder"
.end annotation


# instance fields
.field customAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field customType:Ljava/lang/String;

.field details:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field predefinedAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field predefinedType:Ljava/lang/String;

.field final timestamp:J

.field final type:Lcom/crashlytics/android/answers/SessionEvent$Type;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/answers/SessionEvent$Type;)V
    .locals 3
    .param p1, "type"    # Lcom/crashlytics/android/answers/SessionEvent$Type;

    .prologue
    const/4 v2, 0x0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->type:Lcom/crashlytics/android/answers/SessionEvent$Type;

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->timestamp:J

    .line 99
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->details:Ljava/util/Map;

    .line 100
    iput-object v2, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->customType:Ljava/lang/String;

    .line 101
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->customAttributes:Ljava/util/Map;

    .line 102
    iput-object v2, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->predefinedType:Ljava/lang/String;

    .line 103
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->predefinedAttributes:Ljava/util/Map;

    .line 104
    return-void
.end method


# virtual methods
.method public build(Lcom/crashlytics/android/answers/SessionEventMetadata;)Lcom/crashlytics/android/answers/SessionEvent;
    .locals 11
    .param p1, "sessionEventMetadata"    # Lcom/crashlytics/android/answers/SessionEventMetadata;

    .prologue
    .line 132
    new-instance v0, Lcom/crashlytics/android/answers/SessionEvent;

    iget-wide v2, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->timestamp:J

    iget-object v4, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->type:Lcom/crashlytics/android/answers/SessionEvent$Type;

    iget-object v5, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->details:Ljava/util/Map;

    iget-object v6, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->customType:Ljava/lang/String;

    iget-object v7, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->customAttributes:Ljava/util/Map;

    iget-object v8, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->predefinedType:Ljava/lang/String;

    iget-object v9, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->predefinedAttributes:Ljava/util/Map;

    const/4 v10, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v10}, Lcom/crashlytics/android/answers/SessionEvent;-><init>(Lcom/crashlytics/android/answers/SessionEventMetadata;JLcom/crashlytics/android/answers/SessionEvent$Type;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lcom/crashlytics/android/answers/SessionEvent$1;)V

    return-object v0
.end method

.method public customAttributes(Ljava/util/Map;)Lcom/crashlytics/android/answers/SessionEvent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/crashlytics/android/answers/SessionEvent$Builder;"
        }
    .end annotation

    .prologue
    .line 117
    .local p1, "customAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    iput-object p1, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->customAttributes:Ljava/util/Map;

    .line 118
    return-object p0
.end method

.method public customType(Ljava/lang/String;)Lcom/crashlytics/android/answers/SessionEvent$Builder;
    .locals 0
    .param p1, "customType"    # Ljava/lang/String;

    .prologue
    .line 112
    iput-object p1, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->customType:Ljava/lang/String;

    .line 113
    return-object p0
.end method

.method public details(Ljava/util/Map;)Lcom/crashlytics/android/answers/SessionEvent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/crashlytics/android/answers/SessionEvent$Builder;"
        }
    .end annotation

    .prologue
    .line 107
    .local p1, "details":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->details:Ljava/util/Map;

    .line 108
    return-object p0
.end method

.method public predefinedAttributes(Ljava/util/Map;)Lcom/crashlytics/android/answers/SessionEvent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/crashlytics/android/answers/SessionEvent$Builder;"
        }
    .end annotation

    .prologue
    .line 127
    .local p1, "predefinedAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    iput-object p1, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->predefinedAttributes:Ljava/util/Map;

    .line 128
    return-object p0
.end method

.method public predefinedType(Ljava/lang/String;)Lcom/crashlytics/android/answers/SessionEvent$Builder;
    .locals 0
    .param p1, "predefinedType"    # Ljava/lang/String;

    .prologue
    .line 122
    iput-object p1, p0, Lcom/crashlytics/android/answers/SessionEvent$Builder;->predefinedType:Ljava/lang/String;

    .line 123
    return-object p0
.end method
