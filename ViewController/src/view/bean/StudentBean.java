package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.MyADFUtil;

public class StudentBean {
    public StudentBean() {
    }

    public void deleteStudentDialogListener(DialogEvent dialogEvent) {
            MyADFUtil.executeOperation("Delete");
            MyADFUtil.executeOperation("Commit");
            MyADFUtil.showSuccessfulMessage("Дані по учню вилучено вдало");
        }
}
