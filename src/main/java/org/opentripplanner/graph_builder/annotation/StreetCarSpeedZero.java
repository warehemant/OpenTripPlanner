/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.graph_builder.annotation;

public class StreetCarSpeedZero extends GraphBuilderAnnotation {

    private static final long serialVersionUID = 6872784791854835184L;

    public static final String FMT = "Way %s has car speed zero";
    
    final long way;
    
    public StreetCarSpeedZero(long way){
    	this.way = way;
    }
    
    @Override
    public String getMessage() {
        return String.format(FMT, way);
    }
}
