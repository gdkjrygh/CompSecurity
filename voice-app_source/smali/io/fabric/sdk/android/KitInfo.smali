.class public Lio/fabric/sdk/android/KitInfo;
.super Ljava/lang/Object;
.source "KitInfo.java"


# instance fields
.field private final buildType:Ljava/lang/String;

.field private final identifier:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "buildType"    # Ljava/lang/String;

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lio/fabric/sdk/android/KitInfo;->identifier:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lio/fabric/sdk/android/KitInfo;->version:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lio/fabric/sdk/android/KitInfo;->buildType:Ljava/lang/String;

    .line 29
    return-void
.end method


# virtual methods
.method public getBuildType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lio/fabric/sdk/android/KitInfo;->buildType:Ljava/lang/String;

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lio/fabric/sdk/android/KitInfo;->identifier:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lio/fabric/sdk/android/KitInfo;->version:Ljava/lang/String;

    return-object v0
.end method
