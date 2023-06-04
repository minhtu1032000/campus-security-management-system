package tableModel;

import entity.SecurityPerson;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class SecurityTableModel extends AbstractTableModel {

    private String[] columnNames = {"ID", "Place", "Start", "End", "Date"};
    private ArrayList<SecurityPerson> listData;
    private ArrayList<Object[]> listRow = new ArrayList<>();

    public SecurityTableModel(ArrayList<SecurityPerson> listData) {
        this.listData = listData;
        SecurityPerson temp;
        for (int i = 0; i < this.listData.size(); i++) {
            temp = (SecurityPerson) this.listData.get(i);
            Object[] row = {temp.getIdentityNumber(), temp.getPlace(),
                temp.getDutyStartTime(), temp.getDutyEndTime(), temp.getDate()};
            this.listRow.add(row);
        }
    }

    public int getRowCount() {
        return this.listRow.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    public Object getValueAt(int row, int column) {
        return this.listRow.get(row)[column];
    }

    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Class<?> getColumnClass(int column) {
        Object value = this.listRow.get(0)[column];
        if (value != null) {
            return value.getClass();
        } else {
            return Object.class; // Return Object.class for null values
        }
    }

    public Object getObjectAtRow(int row) {
        return this.listData.get(row);
    }
}
