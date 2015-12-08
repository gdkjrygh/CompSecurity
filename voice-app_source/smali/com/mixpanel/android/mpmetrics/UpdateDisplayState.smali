.class public Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
.super Ljava/lang/Object;
.source "UpdateDisplayState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;,
        Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;",
            ">;"
        }
    .end annotation
.end field

.field private static final DISPLAYSTATE_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY"

.field private static final DISTINCT_ID_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY"

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.UpDisplSt"

.field private static final MAX_LOCK_TIME_MILLIS:J = 0x2932e00L

.field private static final TOKEN_BUNDLE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY"

.field private static sNextIntentId:I

.field private static sShowingIntentId:I

.field private static final sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private static sUpdateDisplayLockMillis:J

.field private static sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;


# instance fields
.field private final mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

.field private final mDistinctId:Ljava/lang/String;

.field private final mToken:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 375
    new-instance v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$1;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 433
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 434
    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLockMillis:J

    .line 435
    const/4 v0, 0x0

    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    .line 436
    const/4 v0, 0x0

    sput v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sNextIntentId:I

    .line 437
    const/4 v0, -0x1

    sput v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sShowingIntentId:I

    .line 444
    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "read"    # Landroid/os/Bundle;

    .prologue
    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 424
    const-string v0, "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDistinctId:Ljava/lang/String;

    .line 425
    const-string v0, "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mToken:Ljava/lang/String;

    .line 426
    const-string v0, "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    .line 427
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;)V
    .locals 0

    .prologue
    .line 423
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method constructor <init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "displayState"    # Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
    .param p2, "distinctId"    # Ljava/lang/String;
    .param p3, "token"    # Ljava/lang/String;

    .prologue
    .line 416
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 417
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDistinctId:Ljava/lang/String;

    .line 418
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mToken:Ljava/lang/String;

    .line 419
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    .line 420
    return-void
.end method

.method public static claimDisplayState(I)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    .locals 2
    .param p0, "intentId"    # I

    .prologue
    .line 356
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 358
    :try_start_0
    sget v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sShowingIntentId:I

    if-lez v0, :cond_1

    sget v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sShowingIntentId:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v0, p0, :cond_1

    .line 371
    :cond_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 360
    const/4 v0, 0x0

    .line 368
    :goto_0
    return-object v0

    .line 361
    :cond_1
    :try_start_1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    if-eqz v0, :cond_0

    .line 366
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLockMillis:J

    .line 367
    sput p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sShowingIntentId:I

    .line 368
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 371
    sget-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 370
    :catchall_0
    move-exception v0

    .line 371
    sget-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 372
    throw v0
.end method

.method static getLockObject()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .prologue
    .line 300
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method static hasCurrentProposal()Z
    .locals 6

    .prologue
    .line 305
    sget-object v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 307
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 308
    .local v0, "currentTime":J
    sget-wide v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLockMillis:J

    sub-long v2, v0, v4

    .line 310
    .local v2, "deltaTime":J
    sget v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sNextIntentId:I

    if-lez v4, :cond_1

    const-wide/32 v4, 0x2932e00

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    .line 311
    const-string v4, "MixpanelAPI.UpDisplSt"

    const-string v5, "UpdateDisplayState set long, long ago, without showing. Update state will be cleared."

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    const/4 v4, 0x0

    sput-object v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    .line 315
    :cond_1
    sget-object v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    :goto_0
    return v4

    :cond_2
    const/4 v4, 0x0

    goto :goto_0
.end method

.method static proposeDisplay(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)I
    .locals 4
    .param p0, "state"    # Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
    .param p1, "distinctId"    # Ljava/lang/String;
    .param p2, "token"    # Ljava/lang/String;

    .prologue
    .line 320
    const/4 v0, -0x1

    .line 322
    .local v0, "ret":I
    sget-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 323
    :cond_0
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->hasCurrentProposal()Z

    move-result v1

    if-nez v1, :cond_2

    .line 324
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLockMillis:J

    .line 325
    new-instance v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    invoke-direct {v1, p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;-><init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    .line 326
    sget v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sNextIntentId:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sNextIntentId:I

    .line 327
    sget v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sNextIntentId:I

    .line 334
    :cond_1
    :goto_0
    return v0

    .line 329
    :cond_2
    sget-boolean v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v1, :cond_1

    .line 330
    const-string v1, "MixpanelAPI.UpDisplSt"

    const-string v2, "Already showing (or cooking) a Mixpanel update, declining to show another."

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static releaseDisplayState(I)V
    .locals 2
    .param p0, "intentId"    # I

    .prologue
    .line 341
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 343
    :try_start_0
    sget v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sShowingIntentId:I

    if-ne p0, v0, :cond_0

    .line 344
    const/4 v0, -0x1

    sput v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sShowingIntentId:I

    .line 345
    const/4 v0, 0x0

    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 348
    :cond_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 350
    return-void

    .line 347
    :catchall_0
    move-exception v0

    .line 348
    sget-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->sUpdateDisplayLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 349
    throw v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 391
    const/4 v0, 0x0

    return v0
.end method

.method public getDisplayState()Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
    .locals 1

    .prologue
    .line 404
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    return-object v0
.end method

.method public getDistinctId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDistinctId:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 412
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mToken:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 396
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 397
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY"

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDistinctId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY"

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mToken:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    const-string v1, "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY"

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 400
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 401
    return-void
.end method
