.class public Lcom/crashlytics/android/core/internal/models/BinaryImageData;
.super Ljava/lang/Object;
.source "BinaryImageData.java"


# instance fields
.field public final baseAddress:J

.field public final id:Ljava/lang/String;

.field public final path:Ljava/lang/String;

.field public final size:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "baseAddress"    # J
    .param p3, "size"    # J
    .param p5, "path"    # Ljava/lang/String;
    .param p6, "id"    # Ljava/lang/String;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-wide p1, p0, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->baseAddress:J

    .line 30
    iput-wide p3, p0, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->size:J

    .line 31
    iput-object p5, p0, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->path:Ljava/lang/String;

    .line 32
    iput-object p6, p0, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->id:Ljava/lang/String;

    .line 33
    return-void
.end method
