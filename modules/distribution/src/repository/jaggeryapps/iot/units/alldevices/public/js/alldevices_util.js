function getAllDevices(){
    var getDevicesRequest = $.ajax({
        url: "api/devices",
        method: "GET",
        contentType: "application/json"
    });

    getDevicesRequest.done(function (data) {
        updateDevicesTable(JSON.parse(data));
    });

    getDevicesRequest.fail(function (jqXHR, textStatus) {
        var err = jqXHR;
        alert("Request failed: " + textStatus);
    });
}

function updateDevicesTable(data) {
    devices = data.data.device;
    if (devices) {
        $('#devicesTable tbody > tr').remove();
        for (var i = 0; i < devices.length; i++) {
            var deviceIdentifier = devices[i].deviceIdentifier;
            var deviceName = devices[i].name;
            $('#devicesTable tbody').append(
                "<tr class='border-top'><th scope='row'>"+deviceIdentifier+"</th>"+
                "<td>"+deviceName+"</td>"+
                "<td class='float-right border-top '>"+
                "<button class='btn-black-action' name='deviceId' value='"+deviceIdentifier+"'>"+
                "<i class='fw fw-view padding-right'></i>View</button>"+
                "<button class='btn-black-action' name='deviceId' value='"+deviceIdentifier+"'>"+
                "<i class='fw fw-edit padding-right'></i>Edit</button>"+
                "<button class='btn-black-action' name='deviceId' value='"+deviceIdentifier+"'>"+
                "<i class='fw fw-delete padding-right'></i>Remove</button>"+
                "</td></tr>");
        }
    }
}

function clearTable(tableId){
    $('#'+tableId+' tbody > tr').remove();
}

$(document).ready(function() {
    console.log("getAllDevices()");
    getAllDevices();
});