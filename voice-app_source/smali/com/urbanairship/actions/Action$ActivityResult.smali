.class public Lcom/urbanairship/actions/Action$ActivityResult;
.super Ljava/lang/Object;
.source "Action.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/actions/Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ActivityResult"
.end annotation


# instance fields
.field private intent:Landroid/content/Intent;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    const/4 v0, 0x0

    iput v0, p0, Lcom/urbanairship/actions/Action$ActivityResult;->resultCode:I

    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/actions/Action$ActivityResult;ILandroid/content/Intent;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/actions/Action$ActivityResult;
    .param p1, "x1"    # I
    .param p2, "x2"    # Landroid/content/Intent;

    .prologue
    .line 195
    invoke-direct {p0, p1, p2}, Lcom/urbanairship/actions/Action$ActivityResult;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private setResult(ILandroid/content/Intent;)V
    .locals 0
    .param p1, "resultCode"    # I
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 217
    iput p1, p0, Lcom/urbanairship/actions/Action$ActivityResult;->resultCode:I

    .line 218
    iput-object p2, p0, Lcom/urbanairship/actions/Action$ActivityResult;->intent:Landroid/content/Intent;

    .line 219
    return-void
.end method


# virtual methods
.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/urbanairship/actions/Action$ActivityResult;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .prologue
    .line 212
    iget v0, p0, Lcom/urbanairship/actions/Action$ActivityResult;->resultCode:I

    return v0
.end method
