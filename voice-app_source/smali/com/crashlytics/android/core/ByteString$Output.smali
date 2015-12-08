.class final Lcom/crashlytics/android/core/ByteString$Output;
.super Ljava/io/FilterOutputStream;
.source "ByteString.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/ByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Output"
.end annotation


# instance fields
.field private final bout:Ljava/io/ByteArrayOutputStream;


# direct methods
.method private constructor <init>(Ljava/io/ByteArrayOutputStream;)V
    .locals 0
    .param p1, "bout"    # Ljava/io/ByteArrayOutputStream;

    .prologue
    .line 341
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 342
    iput-object p1, p0, Lcom/crashlytics/android/core/ByteString$Output;->bout:Ljava/io/ByteArrayOutputStream;

    .line 343
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/ByteArrayOutputStream;Lcom/crashlytics/android/core/ByteString$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/ByteArrayOutputStream;
    .param p2, "x1"    # Lcom/crashlytics/android/core/ByteString$1;

    .prologue
    .line 334
    invoke-direct {p0, p1}, Lcom/crashlytics/android/core/ByteString$Output;-><init>(Ljava/io/ByteArrayOutputStream;)V

    return-void
.end method


# virtual methods
.method public toByteString()Lcom/crashlytics/android/core/ByteString;
    .locals 3

    .prologue
    .line 349
    iget-object v1, p0, Lcom/crashlytics/android/core/ByteString$Output;->bout:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 350
    .local v0, "byteArray":[B
    new-instance v1, Lcom/crashlytics/android/core/ByteString;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/crashlytics/android/core/ByteString;-><init>([BLcom/crashlytics/android/core/ByteString$1;)V

    return-object v1
.end method
