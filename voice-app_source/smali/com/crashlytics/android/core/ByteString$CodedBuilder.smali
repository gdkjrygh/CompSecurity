.class final Lcom/crashlytics/android/core/ByteString$CodedBuilder;
.super Ljava/lang/Object;
.source "ByteString.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/ByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "CodedBuilder"
.end annotation


# instance fields
.field private final buffer:[B

.field private final output:Lcom/crashlytics/android/core/CodedOutputStream;


# direct methods
.method private constructor <init>(I)V
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 377
    new-array v0, p1, [B

    iput-object v0, p0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;->buffer:[B

    .line 378
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;->buffer:[B

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->newInstance([B)Lcom/crashlytics/android/core/CodedOutputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;->output:Lcom/crashlytics/android/core/CodedOutputStream;

    .line 379
    return-void
.end method

.method synthetic constructor <init>(ILcom/crashlytics/android/core/ByteString$1;)V
    .locals 0
    .param p1, "x0"    # I
    .param p2, "x1"    # Lcom/crashlytics/android/core/ByteString$1;

    .prologue
    .line 372
    invoke-direct {p0, p1}, Lcom/crashlytics/android/core/ByteString$CodedBuilder;-><init>(I)V

    return-void
.end method


# virtual methods
.method public build()Lcom/crashlytics/android/core/ByteString;
    .locals 3

    .prologue
    .line 382
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;->output:Lcom/crashlytics/android/core/CodedOutputStream;

    invoke-virtual {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->checkNoSpaceLeft()V

    .line 387
    new-instance v0, Lcom/crashlytics/android/core/ByteString;

    iget-object v1, p0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;->buffer:[B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/crashlytics/android/core/ByteString;-><init>([BLcom/crashlytics/android/core/ByteString$1;)V

    return-object v0
.end method

.method public getCodedOutput()Lcom/crashlytics/android/core/CodedOutputStream;
    .locals 1

    .prologue
    .line 391
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;->output:Lcom/crashlytics/android/core/CodedOutputStream;

    return-object v0
.end method
