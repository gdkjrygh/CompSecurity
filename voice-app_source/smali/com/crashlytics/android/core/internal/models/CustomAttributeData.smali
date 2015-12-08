.class public Lcom/crashlytics/android/core/internal/models/CustomAttributeData;
.super Ljava/lang/Object;
.source "CustomAttributeData.java"


# instance fields
.field public final key:Ljava/lang/String;

.field public final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/crashlytics/android/core/internal/models/CustomAttributeData;->key:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/crashlytics/android/core/internal/models/CustomAttributeData;->value:Ljava/lang/String;

    .line 21
    return-void
.end method
