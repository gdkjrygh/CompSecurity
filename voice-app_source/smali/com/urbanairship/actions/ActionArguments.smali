.class public Lcom/urbanairship/actions/ActionArguments;
.super Ljava/lang/Object;
.source "ActionArguments.java"


# instance fields
.field private final situation:Lcom/urbanairship/actions/Situation;

.field private value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/urbanairship/actions/Situation;Ljava/lang/Object;)V
    .locals 0
    .param p1, "situation"    # Lcom/urbanairship/actions/Situation;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p2, p0, Lcom/urbanairship/actions/ActionArguments;->value:Ljava/lang/Object;

    .line 64
    iput-object p1, p0, Lcom/urbanairship/actions/ActionArguments;->situation:Lcom/urbanairship/actions/Situation;

    .line 65
    return-void
.end method


# virtual methods
.method public getSituation()Lcom/urbanairship/actions/Situation;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/urbanairship/actions/ActionArguments;->situation:Lcom/urbanairship/actions/Situation;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/urbanairship/actions/ActionArguments;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActionArguments situation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/actions/ActionArguments;->situation:Lcom/urbanairship/actions/Situation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/actions/ActionArguments;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
