<h2>Box Office Movies</h2>

<div ng-init="getBoxOfficeTitles()">
	<div ng-repeat="movie in movies" class="ft-movies">
		<movie info="movie"></movie>
	</div>
	
	<div class="showMore" ng-show="canShowMore()"><input type="button" value="Show More" ng-click="showMore()" /></div>
	<div class="pagination">
		<div class="currentStep">{{ movies.length }} movies found</div>
	</div>
	<a name="end" />
</div>
