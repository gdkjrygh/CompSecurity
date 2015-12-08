.class public final Lcom/facebook/share/model/ShareOpenGraphAction;
.super Lcom/facebook/share/model/ShareOpenGraphValueContainer;
.source "ShareOpenGraphAction.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/model/ShareOpenGraphAction$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/model/ShareOpenGraphValueContainer",
        "<",
        "Lcom/facebook/share/model/ShareOpenGraphAction;",
        "Lcom/facebook/share/model/ShareOpenGraphAction$Builder;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/share/model/ShareOpenGraphAction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    new-instance v0, Lcom/facebook/share/model/ShareOpenGraphAction$1;

    invoke-direct {v0}, Lcom/facebook/share/model/ShareOpenGraphAction$1;-><init>()V

    .line 56
    sput-object v0, Lcom/facebook/share/model/ShareOpenGraphAction;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 65
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/share/model/ShareOpenGraphValueContainer;-><init>(Landroid/os/Parcel;)V

    .line 43
    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/model/ShareOpenGraphAction$Builder;)V
    .locals 0
    .param p1, "builder"    # Lcom/facebook/share/model/ShareOpenGraphAction$Builder;

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/share/model/ShareOpenGraphValueContainer;-><init>(Lcom/facebook/share/model/ShareOpenGraphValueContainer$Builder;)V

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/model/ShareOpenGraphAction$Builder;Lcom/facebook/share/model/ShareOpenGraphAction;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/share/model/ShareOpenGraphAction;-><init>(Lcom/facebook/share/model/ShareOpenGraphAction$Builder;)V

    return-void
.end method


# virtual methods
.method public getActionType()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .prologue
    .line 52
    const-string v0, "og:type"

    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareOpenGraphAction;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
