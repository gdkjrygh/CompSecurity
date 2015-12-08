.class public Lcom/crashlytics/android/core/UserMetaData;
.super Ljava/lang/Object;
.source "UserMetaData.java"


# static fields
.field public static final EMPTY:Lcom/crashlytics/android/core/UserMetaData;


# instance fields
.field public final email:Ljava/lang/String;

.field public final id:Ljava/lang/String;

.field public final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Lcom/crashlytics/android/core/UserMetaData;

    invoke-direct {v0}, Lcom/crashlytics/android/core/UserMetaData;-><init>()V

    sput-object v0, Lcom/crashlytics/android/core/UserMetaData;->EMPTY:Lcom/crashlytics/android/core/UserMetaData;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, v0, v0, v0}, Lcom/crashlytics/android/core/UserMetaData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "email"    # Ljava/lang/String;

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/crashlytics/android/core/UserMetaData;->id:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/crashlytics/android/core/UserMetaData;->name:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/crashlytics/android/core/UserMetaData;->email:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/crashlytics/android/core/UserMetaData;->id:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/core/UserMetaData;->name:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/core/UserMetaData;->email:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
