package steps;

import elements.createIssuePageElements;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class createIssuePageSteps extends createIssuePageElements {

    @Step("Открыть окно создания задачи")
    public void OpenCreateTaskWindow() {
        CreateButton.shouldBe(visible, Duration.ofSeconds(30)).click();
        CreateWindow.shouldBe(visible, Duration.ofSeconds(30));


    }

    @Step("Зполняем поля:выбора проекта, типа задачи, названия задачи, поле описание")
    public void FillRequiredFields() {
//        ProjectField.shouldBe(visible, Duration.ofSeconds(30)).setValue("Test (TEST)").pressEnter();
//
       IssueTypeField.shouldBe(visible, Duration.ofSeconds(30)).setValue("Ошибка").pressEnter();

        IssueSummary.shouldBe(visible, Duration.ofSeconds(30)).setValue("Ошибка_Тестовая").pressEnter();//поле названия задачи

        IssueDescriptionType.shouldBe(visible, Duration.ofSeconds(30)).click();//поле описание
        IssueDescription.shouldBe(visible, Duration.ofSeconds(30)).setValue("Ошибка_Тестовая_Описание").pressEnter();


    }



    @Step("Заполняем поле Исправить в версиях")
    public void FillFixVersionField() {
        IssueFixVersion.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Заполняем поле приоритета задачи")
    public void FillPriorityField() {

        PriorityField.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Заполняем поле Метки")
    public void FillLabelsField() {
        Issuelabels.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Заполняем поле окружения задачи")
    public void FillEnvironmentField() {
        IssueEnvironmentType.shouldBe(visible, Duration.ofSeconds(30)).click();
        IssueEnvironment.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Заполняем поле Затронуты версии")
    public void FillAffectedVersionField() {
        IssueAffectedVersion.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Заполняем поля Связанные задачи")
    public static void selectIssueRelatedTasks() {
        IssueRelatedTasksType.shouldBe(visible, Duration.ofSeconds(30)).click();
        IssueRelatedTasks.shouldBe(visible, Duration.ofSeconds(30)).click();//вставить текст
    }

    @Step("Нажимаем кнопку Назначить на меня")
    public static void assignIssueToMe() {
        IssueAssignToMe.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Заполняем поле Спринт")
    public static void enterIssueSprint() {
        IssueSprint.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Нажимаем на кнопку создать")
    public static void clickCreateIssueButton() {
        CreateIssueButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Получаем Код  созданной задачи")
    public void checkCreatedIssueKey() {
        CreatedIssueKey.shouldBe(visible, Duration.ofSeconds(30));
    }

    @Step("Проверяем что задача назначена на меня")
    public void checkCreatedIssueAssignToMe() {
        CreatedIssueChoice.shouldBe(visible, Duration.ofSeconds(30));
    }

    @Step("Переводим в статус Вработе")
    public void checkIssueStatusInWork() {
        IssueStatusInWork.shouldBe(visible, Duration.ofSeconds(30));
    }

    @Step("Нажимаем на кнопку бизнес процесс")
    public void clickIssueStatusWorkFlow() {
        IssueStatusWorkFlow.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Открываем окно перевода задачи в статус Исполнено ")
    public void checkIssueFinalizationWindow() {
        IssueFinalizationWindowCheck.shouldBe(visible, Duration.ofSeconds(30));
    }

    @Step("Нажимаем на кнопку Исполнено")
    public void clickIssueFinalizationWindowCheckButton() {
        IssueFinalizationWindowCheckButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    @Step("Проверяем статус Закрыто")
    public void checkIssueStatusClosed() {
        checkIssueStatusClosed.shouldBe(visible, Duration.ofSeconds(30)).click();
    }


}



