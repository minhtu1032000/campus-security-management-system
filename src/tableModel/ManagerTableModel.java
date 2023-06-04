package tableModel;

import entity.SecurityPerson;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ManagerTableModel extends AbstractTableModel {

    private String[] columnNames = {"ID", "Name", "Place", "Duty Start Time", "Duty End Time", "Date"};
    private ArrayList<SecurityPerson> listData;
    private ArrayList<Object[]> listRow = new ArrayList<>();

    public ManagerTableModel(ArrayList<SecurityPerson> listData) {
        this.listData = listData;
        SecurityPerson temp;
        for (int i = 0; i < this.listData.size(); i++) {
            temp = (SecurityPerson) this.listData.get(i);
            Object[] row = {temp.getIdentityNumber(), temp.getName(), temp.getPlace(),
                temp.getDutyStartTime(), temp.getDutyEndTime(), temp.getDate()
            };
            this.listRow.add(row);
        }
    }

    @Override
    public int getRowCount() {
        return listRow.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return listRow.get(row)[column];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
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
        return listData.get(row);
    }
}
